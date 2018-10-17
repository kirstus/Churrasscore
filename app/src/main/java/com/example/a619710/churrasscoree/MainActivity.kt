package com.example.a619710.churrasscoree

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var oSamEBrabo = true
        var firstCounterTruco = 0
        var secondCounterTruco = 0
        var firstVictoryCounterTruco = 0
        var secondVictoryCounterTruco = 0
        firstTeamCounter.text = firstCounterTruco.toString()
        firstVictoryCounter.text = getString(R.string.Vitorias) + firstVictoryCounterTruco.toString()
        secondTeamCounter.text = secondCounterTruco.toString()
        secondVictoryCounter.text = getString(R.string.Vitorias) + secondVictoryCounterTruco.toString()

        btnPlusTruco.setOnClickListener(){

            if(oSamEBrabo){
                firstCounterTruco++


                if(firstCounterTruco >= 12){
                    firstCounterTruco = 0
                    secondCounterTruco = 0
                    firstVictoryCounterTruco++
                }

                firstTeamCounter.text = firstCounterTruco.toString()
                secondTeamCounter.text = secondCounterTruco.toString()
                firstVictoryCounter.text = getString(R.string.Vitorias) + firstVictoryCounterTruco.toString()
            }
            else{
                secondCounterTruco++


                if(secondCounterTruco >= 12){
                    firstCounterTruco = 0
                    secondCounterTruco = 0
                    secondVictoryCounterTruco++
                }

                firstTeamCounter.text = firstCounterTruco.toString()
                secondTeamCounter.text = secondCounterTruco.toString()
                secondVictoryCounter.text = getString(R.string.Vitorias) + secondVictoryCounterTruco.toString()
            }
        }

        btnMinusTruco.setOnClickListener(){

            if(oSamEBrabo){
                if(firstCounterTruco > 0) {
                    firstCounterTruco--
                    firstTeamCounter.text = firstCounterTruco.toString()
                }
            }
            else{
                if(secondCounterTruco > 0) {
                    secondCounterTruco--
                    secondTeamCounter.text = secondCounterTruco.toString()
                }
            }
        }

        btnPlusThree.setOnClickListener(){

            if(oSamEBrabo){
                firstCounterTruco+=3


                if(firstCounterTruco >= 12){
                    firstCounterTruco = 0
                    secondCounterTruco = 0
                    firstVictoryCounterTruco++
                }

                firstTeamCounter.text = firstCounterTruco.toString()
                secondTeamCounter.text = secondCounterTruco.toString()
                firstVictoryCounter.text = getString(R.string.Vitorias) + firstVictoryCounterTruco.toString()
            }
            else{
                secondCounterTruco+=3


                if(secondCounterTruco >= 12){
                    firstCounterTruco = 0
                    secondCounterTruco = 0
                    secondVictoryCounterTruco++
                }

                firstTeamCounter.text = firstCounterTruco.toString()
                secondTeamCounter.text = secondCounterTruco.toString()
                secondVictoryCounter.text = getString(R.string.Vitorias) + secondVictoryCounterTruco.toString()
            }
        }

        btnPlusSix.setOnClickListener(){

            if(oSamEBrabo){
                firstCounterTruco+=6


                if(firstCounterTruco >= 12){
                    firstCounterTruco = 0
                    secondCounterTruco = 0
                    firstVictoryCounterTruco++
                }

                firstTeamCounter.text = firstCounterTruco.toString()
                secondTeamCounter.text = secondCounterTruco.toString()
                firstVictoryCounter.text = getString(R.string.Vitorias) + firstVictoryCounterTruco.toString()
            }
            else{
                secondCounterTruco+=6


                if(secondCounterTruco >= 12){
                    firstCounterTruco = 0
                    secondCounterTruco = 0
                    secondVictoryCounterTruco++
                }

                firstTeamCounter.text = firstCounterTruco.toString()
                secondTeamCounter.text = secondCounterTruco.toString()
                secondVictoryCounter.text = getString(R.string.Vitorias) + secondVictoryCounterTruco.toString()
            }
        }

        btnPlusNine.setOnClickListener(){

            if(oSamEBrabo){
                firstCounterTruco+=9


                if(firstCounterTruco >= 12){
                    firstCounterTruco = 0
                    secondCounterTruco = 0
                    firstVictoryCounterTruco++
                }

                firstTeamCounter.text = firstCounterTruco.toString()
                secondTeamCounter.text = secondCounterTruco.toString()
                firstVictoryCounter.text = getString(R.string.Vitorias) + firstVictoryCounterTruco.toString()
            }
            else{
                secondCounterTruco+=9


                if(secondCounterTruco >= 12){
                    firstCounterTruco = 0
                    secondCounterTruco = 0
                    secondVictoryCounterTruco++
                }

                firstTeamCounter.text = firstCounterTruco.toString()
                secondTeamCounter.text = secondCounterTruco.toString()
                secondVictoryCounter.text = getString(R.string.Vitorias) + secondVictoryCounterTruco.toString()
            }
        }

        btnPlusTwelve.setOnClickListener(){

            if(oSamEBrabo){
                firstCounterTruco+=12


                if(firstCounterTruco >= 12){
                    firstCounterTruco = 0
                    secondCounterTruco = 0
                    firstVictoryCounterTruco++
                }

                firstTeamCounter.text = firstCounterTruco.toString()
                secondTeamCounter.text = secondCounterTruco.toString()
                firstVictoryCounter.text = getString(R.string.Vitorias) + firstVictoryCounterTruco.toString()
            }
            else{
                secondCounterTruco+=12


                if(secondCounterTruco >= 12){
                    firstCounterTruco = 0
                    secondCounterTruco = 0
                    secondVictoryCounterTruco++
                }

                firstTeamCounter.text = firstCounterTruco.toString()
                secondTeamCounter.text = secondCounterTruco.toString()
                secondVictoryCounter.text = getString(R.string.Vitorias) + secondVictoryCounterTruco.toString()
            }
        }

        firstTeamCounter.setOnClickListener(){
            oSamEBrabo = true
            firstTeamCounter.setBackgroundColor(getColor(R.color.whiteishGray))
            secondTeamCounter.setBackgroundColor(getColor(R.color.transparent))
        }

        secondTeamCounter.setOnClickListener(){
            oSamEBrabo = false
            secondTeamCounter.setBackgroundColor(getColor(R.color.whiteishGray))
            firstTeamCounter.setBackgroundColor(getColor(R.color.transparent))
        }
    }
}