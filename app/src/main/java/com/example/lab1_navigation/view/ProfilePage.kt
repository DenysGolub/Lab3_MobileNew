package com.example.lab1_navigation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1_navigation.viewmodel.ProfileViewModel

@Composable
fun ProfilePage(
    modifier: Modifier = Modifier,
    viewModel: ProfileViewModel
) {

    val users by viewModel.users.observeAsState(emptyList())
    val products by viewModel.products.observeAsState(emptyList())

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE8EAF6)).systemBarsPadding(),
        contentPadding = PaddingValues(24.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        item {
            Text(
                "Список користувачів з продуктами",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E)
            )
        }

        items(users) { user ->

            ElevatedCard(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text("Ім’я: ${user.name}", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text("Вік: ${user.age}", color = Color.DarkGray)

                    Text(
                        "Продукти користувача:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF303F9F)
                    )

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        items(products) { product ->
                            ProductMiniCard(
                                title = product.title,
                                price = product.price
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ProductMiniCard(title: String, price: Double) {
    Card(
        modifier = Modifier.width(150.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(12.dp)
        ) {
            Text(title, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(6.dp))
            Text("Ціна: $price $", fontSize = 14.sp, color = Color.Gray)
        }
    }
}
