package com.example.a619710.churrasscoree

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_chutegol.*

class ChutegolActivity : AppCompatActivity() {
    var handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chutegol)

        var oSamEBrabo = true
        var firstCounterChutegol = 0
        var secondCounterChutegol = 0
        var firstVictoryCounterChutegol = 0
        var secondVictoryCounterChutegol = 0
        var progressStatus = 0
        var resumeTimer = false

        firstTeamCounterChutegol.text = firstCounterChutegol.toString()
        secondTeamCounterChutegol.text = secondCounterChutegol.toString()
        firstTeamVictoryCounterChutegol.text = getString(R.string.Vitorias) + firstVictoryCounterChutegol.toString()
        secondTeamVictoryCounterChutegol.text = getString(R.string.Vitorias) + secondVictoryCounterChutegol.toString()

        btnAddChutegol.setOnClickListener() {
            if (oSamEBrabo) {
                firstCounterChutegol++

                firstTeamCounterChutegol.text = firstCounterChutegol.toString()
                firstTeamVictoryCounterChutegol.text = getString(R.string.Vitorias) + firstVictoryCounterChutegol.toString()
            } else {
                secondCounterChutegol++

                secondTeamCounterChutegol.text = secondCounterChutegol.toString()
                secondTeamVictoryCounterChutegol.text = getString(R.string.Vitorias) + secondVictoryCounterChutegol.toString()
            }
        }

        btnMinusChutegol.setOnClickListener() {
            if (oSamEBrabo) {
                if (firstCounterChutegol > 0) {
                    firstCounterChutegol--
                    firstTeamCounterChutegol.text = firstCounterChutegol.toString()
                }
            } else {
                if (secondCounterChutegol > 0) {
                    secondCounterChutegol--
                    secondTeamCounterChutegol.text = secondCounterChutegol.toString()
                }
            }
        }

        playButton.setOnClickListener() {
            resumeTimer = true

            if (progressStatus == 0) {
                // Start thread for game timer
                Thread(Runnable {
                    while (progressStatus < 20) {
                        if (resumeTimer) {
                            progressStatus += 1
                        }

                        handler.post(Runnable {
                            determinateBar.setProgress(progressStatus)
                        })
                        try {
                            // Sleep for 900 milliseconds.
                            Thread.sleep(900)
                        } catch (e: InterruptedException) {
                            e.printStackTrace()
                        }

                    }

                    progressStatus = 0
                    if (firstCounterChutegol > secondCounterChutegol) {
                        firstVictoryCounterChutegol++
                    } else {
                        secondVictoryCounterChutegol++
                    }
                    firstCounterChutegol = 0
                    secondCounterChutegol = 0

                    handler.post(Runnable {
                        determinateBar.setProgress(0)
                        resumeTimer = false
                        firstTeamCounterChutegol.text = firstCounterChutegol.toString()
                        secondTeamCounterChutegol.text = secondCounterChutegol.toString()
                        firstTeamVictoryCounterChutegol.text = getString(R.string.Vitorias) + firstVictoryCounterChutegol.toString()
                        secondTeamVictoryCounterChutegol.text = getString(R.string.Vitorias) + secondVictoryCounterChutegol.toString()
                    })
                }).start()
            }
        }

        pauseButton.setOnClickListener() {
            resumeTimer = false
        }

        firstTeamCounterChutegol.setOnClickListener() {
            oSamEBrabo = true
            firstTeamCounterChutegol.setBackgroundColor(getColor(R.color.whiteishGray))
            secondTeamCounterChutegol.setBackgroundColor(getColor(R.color.transparent))
        }

        secondTeamCounterChutegol.setOnClickListener() {
            oSamEBrabo = false
            firstTeamCounterChutegol.setBackgroundColor(getColor(R.color.transparent))
            secondTeamCounterChutegol.setBackgroundColor(getColor(R.color.whiteishGray))
        }
    }
}