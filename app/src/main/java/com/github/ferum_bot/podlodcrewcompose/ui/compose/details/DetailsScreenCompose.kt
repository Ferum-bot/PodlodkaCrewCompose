package com.github.ferum_bot.podlodcrewcompose.ui.compose.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.github.ferum_bot.podlodcrewcompose.ui.compose.utills.GlideImage
import com.github.ferum_bot.podlodcrewcompose.ui.fragment.detail.DetailScreenViewModel
import com.github.ferum_bot.podlodcrewcompose.ui.theme.PodlodCrewComposeTheme


@Composable
fun detailsScreenMainComponent(viewModel: DetailScreenViewModel = DetailScreenViewModel()) {
    val model = viewModel.session.observeAsState()

    

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GlideImage(url = model.value?.imageUrl) {
            centerCrop()
        }
        Text(
            text = model.value?.speaker ?: "",
            textAlign = TextAlign.Center,
            color = Color.Black,
            fontSize = 20.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun detailsScreenPreview() {
    PodlodCrewComposeTheme {
        detailsScreenMainComponent()
    }
}