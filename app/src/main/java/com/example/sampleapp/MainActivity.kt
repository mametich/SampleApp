package com.example.sampleapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.primarySurface
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.sampleapp.ui.theme.SampleAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SampleAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomNavigationBar()
                    }
                ) { innerPadding ->

                }
            }
        }
    }
}


@Composable
fun BottomNavigationBar() {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.primarySurface,
        contentColor = MaterialTheme.colors.onPrimary
    ) {
        BottomNavigationItem(
            icon = {
                Icon(
                    ImageVector.vectorResource(R.drawable.ic_chat),
                    contentDescription = "Chat"
                )
            },
            selected = false,
            onClick = { }
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    ImageVector.vectorResource(R.drawable.ic_camera),
                    contentDescription = "camera"
                )
            },
            selected = false,
            onClick = { }
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    ImageVector.vectorResource(R.drawable.ic_translate),
                    contentDescription = "translate"
                )
            },
            selected = false,
            onClick = { }
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    ImageVector.vectorResource(R.drawable.ic_history),
                    contentDescription = "history"
                )
            },
            selected = false,
            onClick = { }
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    ImageVector.vectorResource(R.drawable.ic_fav),
                    contentDescription = "favorites"
                )
            },
            selected = false,
            onClick = { }
        )
    }
}


@Preview
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigationBar()
}

