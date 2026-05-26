package com.example.article

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier) { // le column faut le mettre a linterieu du scaffold
                        Information(
                            title = stringResource(R.string.title),
                            subtitleOne = stringResource(R.string.subtitleOne),
                            subtitleTwo = stringResource(R.string.subtitleTwo),
                        )
                    }
                }

            }
        }
    }
}

@Composable
fun Information(
    title: String,
    subtitleOne: String,
    subtitleTwo: String,
    modifier: Modifier = Modifier,
) {
    Text(
        text = title, // nom de la variable
        modifier = modifier.padding(16.dp),
        textAlign = TextAlign.Justify,
        fontSize = 24.sp,
    )
    Text(
        text = subtitleOne,
        modifier = modifier.padding(16.dp),
        textAlign = TextAlign.Justify,
    )
    Text(
        text = subtitleTwo,
        modifier = modifier.padding(16.dp),
        textAlign = TextAlign.Justify,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Information(
                title = stringResource(R.string.title),
                subtitleOne = stringResource(R.string.subtitleOne),
                subtitleTwo = stringResource(R.string.subtitleTwo),
                modifier = Modifier.padding(innerPadding),
            )
        }
    }
}