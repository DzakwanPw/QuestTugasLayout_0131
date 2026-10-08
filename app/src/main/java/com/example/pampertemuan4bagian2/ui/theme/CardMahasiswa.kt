package com.example.pampertemuan4bagian2.ui.theme

import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.example.pampertemuan4bagian2.R

// Mengubah ukuran dari dimens.xml (sp) menjadi ukuran teks
@Composable
fun spResource(@DimenRes id: Int): TextUnit =
    with(LocalDensity.current) { dimensionResource(id).toSp() }

// Satu fungsi Card yang dipakai untuk keempat card
@Composable
fun CardMahasiswa(
    @StringRes nama: Int,
    @StringRes alamat: Int,
    @ColorRes warnaCard: Int,
    @ColorRes warnaAlamat: Int,
    modifier: Modifier = Modifier,
    @StringRes telepon: Int? = null,
    fontNama: FontFamily? = null,
    fontWeightNama: FontWeight = FontWeight.Bold
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner)),
        colors = CardDefaults.cardColors(containerColor = colorResource(warnaCard))
    ) {
        Row(
            modifier = Modifier.padding(dimensionResource(R.dimen.card_padding)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = dimensionResource(R.dimen.spacing_large))
            ) {
                Text(
                    text = stringResource(nama),
                    color = colorResource(R.color.text_white),
                    fontSize = spResource(R.dimen.text_name),
                    fontWeight = fontWeightNama,
                    fontFamily = fontNama
                )
                if (telepon != null) {
                    Text(
                        text = stringResource(telepon),
                        color = colorResource(R.color.text_cyan),
                        fontSize = spResource(R.dimen.text_detail)
                    )
                }
                Text(
                    text = stringResource(alamat),
                    color = colorResource(warnaAlamat),
                    fontSize = spResource(R.dimen.text_detail)
                )
            }
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
            )
        }
    }
}