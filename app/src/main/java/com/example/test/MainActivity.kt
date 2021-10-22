package com.example.test

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var edtPanjang: EditText? = null
    private var edtLebar: EditText? = null
    private var lpersegi: Button? = null
    private var kpersegi: Button? = null
    private var ksegitiga: Button? = null
    private var lsegitiga: Button? = null
    private var klingkaran: Button? = null
    private var llingkaran: Button? = null
    private var txtLuas: TextView? = null
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtPanjang = findViewById<View>(R.id.edt_panjang) as EditText
        edtLebar = findViewById<View>(R.id.edt_lebar) as EditText
        lpersegi = findViewById<View>(R.id.l_persegi) as Button
        kpersegi = findViewById<View>(R.id.k_persegi) as Button
        lsegitiga = findViewById<View>(R.id.l_segitiga) as Button
        ksegitiga = findViewById<View>(R.id.k_segitiga) as Button
        llingkaran = findViewById<View>(R.id.l_lingkaran) as Button
        klingkaran = findViewById<View>(R.id.k_lingkaran) as Button
        txtLuas = findViewById<View>(R.id.txt_luas) as TextView
        supportActionBar!!.title = "Kalkulator Bidang Datar"


        lpersegi!!.setOnClickListener {
            val panjang: String = edtPanjang!!.text.toString()
            val lebar: String = edtLebar!!.text.toString()

            when {
                TextUtils.isEmpty(panjang) -> {
                    edtPanjang!!.error = "Tidak Boleh Kosong!!!"
                    edtPanjang!!.requestFocus()
                }
                TextUtils.isEmpty(lebar) -> {
                    edtLebar!!.error = "Tidak Boleh Kosong!!!"
                    edtLebar!!.requestFocus()
                }
                else -> {

                    val p = panjang.toDouble()
                    val l = lebar.toDouble()
                    val hasil = p * l

                    txtLuas!!.text = "Hasil  : $hasil"
                }
            }
        }
        kpersegi!!.setOnClickListener {
            val panjang: String = edtPanjang!!.text.toString()
            val lebar: String = edtLebar!!.text.toString()

            when {
                TextUtils.isEmpty(panjang) -> {
                    edtPanjang!!.error = "Tidak Boleh Kosong!!!"
                    edtPanjang!!.requestFocus()
                }
                TextUtils.isEmpty(lebar) -> {
                    edtLebar!!.error = "Tidak Boleh Kosong!!!"
                    edtLebar!!.requestFocus()
                }
                else -> {

                    val p = panjang.toDouble()
                    lebar.toDouble()
                    val hasil = 4 * p

                    txtLuas!!.text = "Hasil : $hasil"
                }
            }
        }
        lsegitiga!!.setOnClickListener {
        val panjang: String = edtPanjang!!.text.toString()
            val lebar: String = edtLebar!!.text.toString()

            when {
                TextUtils.isEmpty(panjang) -> {
                    edtPanjang!!.error = "Tidak Boleh Kosong!!!"
                    edtPanjang!!.requestFocus()
                }
                TextUtils.isEmpty(lebar) -> {
                    edtLebar!!.error = "Tidak Boleh Kosong!!!"
                    edtLebar!!.requestFocus()
                }
                else -> {

                    val p = panjang.toDouble()
                    val l = lebar.toDouble()
                    val hasil = p / 2 * l

                    txtLuas!!.text = "Hasil : $hasil"
                }
            }
    }
        ksegitiga!!.setOnClickListener {
            val panjang: String = edtPanjang!!.text.toString()
            val lebar: String = edtLebar!!.text.toString()

            when {
                TextUtils.isEmpty(panjang) -> {
                    edtPanjang!!.error = "Tidak Boleh Kosong!!!"
                    edtPanjang!!.requestFocus()
                }
                TextUtils.isEmpty(lebar) -> {
                    edtLebar!!.error = "Tidak Boleh Kosong!!!"
                    edtLebar!!.requestFocus()
                }
                else -> {

                    val p = panjang.toDouble()
                    lebar.toDouble()
                    val hasil = p + p + p
                    txtLuas!!.text = "Hasil : $hasil"
                }
            }
        }
        llingkaran!!.setOnClickListener {
            val panjang: String = edtPanjang!!.text.toString()
            val lebar: String = edtLebar!!.text.toString()

            when {
                TextUtils.isEmpty(panjang) -> {
                    edtPanjang!!.error = "Tidak Boleh Kosong!!!"
                    edtPanjang!!.requestFocus()
                }
                TextUtils.isEmpty(lebar) -> {
                    edtLebar!!.error = "Tidak Boleh Kosong!!!"
                    edtLebar!!.requestFocus()
                }
                else -> {

                    val p = panjang.toDouble()
                    lebar.toDouble()
                    val hasil = 3.14 * p * p

                    txtLuas!!.text = "Hasil : $hasil"
                }
            }
        }
        klingkaran!!.setOnClickListener {
            val panjang: String = edtPanjang!!.text.toString()
            val lebar: String = edtLebar!!.text.toString()
            when {
                TextUtils.isEmpty(panjang) -> {
                    edtPanjang!!.error = "Tidak Boleh Kosong!!!"
                    edtPanjang!!.requestFocus()
                }
                TextUtils.isEmpty(lebar) -> {
                    edtLebar!!.error = "Tidak Boleh Kosong!!!"
                    edtLebar!!.requestFocus()
                }
                else -> {

                    val p = panjang.toDouble()
                    lebar.toDouble()
                    val hasil = 3.14 * 2 * p + p

                    txtLuas!!.text = "Hasil : $hasil"
                }
            }
        }
        }
    }