package com.example.pampertemuan4bagian2.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.pampertemuan4bagian2.R

@Composable
fun LayoutScreen(modifier: Modifier = Modifier) {
    val fontTulisan = FontFamily(Font(R.font.dancing_script))

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.background_screen))
            .padding(dimensionResource(R.dimen.screen_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(dimensionResource(R.dimen.header_top_padding)))

        Text(
            text = stringResource(R.string.title_prodi),
            color = colorResource(R.color.text_primary),
            fontSize = spResource(R.dimen.text_title),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.title_univ),
            color = colorResource(R.color.text_primary),
            fontSize = spResource(R.dimen.text_subtitle),
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(dimensionResource(R.dimen.spacing_large)))

        Column(
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.spacing_medium))
        ) {
            CardMahasiswa(
                nama = R.string.name_bambang,
                alamat = R.string.address_bambang,
                warnaCard = R.color.card_gray,
                warnaAlamat = R.color.text_yellow,
                fontNama = fontTulisan,
                fontWeightNama = FontWeight.Normal
            )
            CardMahasiswa(
                nama = R.string.name_gibran,
                telepon = R.string.phone_number,
                alamat = R.string.address_gibran,
                warnaCard = R.color.card_purple,
                warnaAlamat = R.color.text_yellow
            )
            CardMahasiswa(
                nama = R.string.name_zhilal,
                telepon = R.string.phone_number,
                alamat = R.string.address_zhilal,
                warnaCard = R.color.card_blue,
                warnaAlamat = R.color.text_white
            )
            CardMahasiswa(
                nama = R.string.name_ahmad,
                telepon = R.string.phone_number,
                alamat = R.string.address_ahmad,
                warnaCard = R.color.card_green,
                warnaAlamat = R.color.text_white
            )
        }

        Spacer(Modifier.weight(1f))

        Text(
            text = stringResource(R.string.footer_copyright),
            color = colorResource(R.color.text_primary),
            fontSize = spResource(R.dimen.text_footer),
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.footer_bottom_padding))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LayoutScreenPreview() {
    LayoutScreen()
}