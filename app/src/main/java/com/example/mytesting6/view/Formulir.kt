package com.example.mytesting6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenis: List<String> = listOf("Laki-laki", "Perempuan"),
    onSubmitBtnClick: () -> Unit
) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = "Form Isian")) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) {
        if (isiRuang) {
            Column(
                modifier = Modifier.padding(paddingValues = isiRuang),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedTextField(
                    value = "",
                    singleLine = true,
                    modifier = Modifier
                        .padding(top = 28.dp)
                        .width(250.dp), thickness = Thickness,color = Color.Red)

                Row(
                    jenisK.forEach {
                            item->
                        Row(verticalAlignment = Alignment.CenterVertically){
                            RadioButton(
                                selected = false,
                                onClick = {item}
                            )
                            Text(text = item)
                        }
                    }
            }
        }

        )
            }
        }
    }
}