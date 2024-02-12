package com.example.bootcampders1.nesne_tabanli_programlama

class Odev2 {
    fun mileDonusturme(km: Double): Double {
        return km * 0.621
    }

    fun dikdortgenAlanHesapla(kisaKenar: Int, uzunKenar: Int) {
        println("Dikdörtgenin Alanı : ${kisaKenar * uzunKenar}")
    }

    fun faktoriyelHesapla(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    fun eHarfininSayisi(kelime: String) {
        val harfListesi = kelime.toCharArray()
        var eSayaci = 0
        for (element in harfListesi) {
            if (element == 'e') {
                eSayaci++
            }
        }
        println(eSayaci)
    }

    fun icAcilarToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }

    fun maasHesabi(calisilanGun: Int) {
        val calisilanSaat = calisilanGun * 8
        val mesaiUcreti = 80
        val calismaUcreti = 40
        var calismaKazanci = 0

        if (calisilanSaat > 150) {
            val mesaiSaati = calisilanSaat - 150
            val mesaiKazanci = mesaiUcreti * mesaiSaati
            calismaKazanci = calismaUcreti * 150
            println("Maaş : ${mesaiKazanci + calismaKazanci}")
        } else {
            calismaKazanci = calismaUcreti * calisilanSaat
            println("Maaş : ${calismaKazanci}")
        }

    }

    fun otoparkUcretBelirleme(saat: Int): Int {
        val saatAsimi = saat - 1
        if (saat > 1) {
            return (saatAsimi * 10) + 50
        } else return 50
    }


}
