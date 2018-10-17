package com.example.a619710.churrasscoree

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_toto.*

class TotoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toto)

        var oSamEBrabo = true
        var firstCounterToto = 0
        var secondCounterToto = 0
        var firstVictoryCounterToto = 0
        var secondVictoryCounterToto = 0

        firstTeamCounterToto.text = firstCounterToto.toString()
        secondTeamCounterToto.text = secondCounterToto.toString()
        firstTeamVictoryCounterToto.text = getString(R.string.Vitorias) + firstVictoryCounterToto.toString()
        secondTeamVictoryCounterToto.text = getString(R.string.Vitorias) + secondVictoryCounterToto.toString()

        btnAddToto.setOnClickListener(){
            if(oSamEBrabo){
                firstCounterToto++

                firstTeamCounterToto.text = firstCounterToto.toString()
                firstTeamVictoryCounterToto.text = getString(R.string.Vitorias) + firstVictoryCounterToto.toString()
            }
            else{
                secondCounterToto++

                secondTeamCounterToto.text = secondCounterToto.toString()
                secondTeamVictoryCounterToto.text = getString(R.string.Vitorias) + secondVictoryCounterToto.toString()
            }
        }

        btnMinusToto.setOnClickListener(){
            if(oSamEBrabo){
                if(firstCounterToto > 0) {
                    firstCounterToto--
                    firstTeamCounterToto.text = firstCounterToto.toString()
                }
            }
            else{
                if(secondCounterToto > 0) {
                    secondCounterToto--
                    secondTeamCounterToto.text = secondCounterToto.toString()
                }
            }
        }

        firstTeamCounterToto.setOnClickListener(){
            oSamEBrabo = true
            firstTeamCounterToto.setBackgroundColor(getColor(R.color.whiteishGray))
            secondTeamCounterToto.setBackgroundColor(getColor(R.color.transparent))
        }

        secondTeamCounterToto.setOnClickListener(){
            oSamEBrabo = false
            firstTeamCounterToto.setBackgroundColor(getColor(R.color.transparent))
            secondTeamCounterToto.setBackgroundColor(getColor(R.color.whiteishGray))
        }
    }
}