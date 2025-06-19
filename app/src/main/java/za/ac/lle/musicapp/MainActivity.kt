package za.ac.lle.musicapp

import android.os.Bundle
import android.provider.MediaStore.Audio.Artists
import android.provider.MediaStore.Audio.Playlists
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import za.ac.lle.musicapp.ui.theme.MusicAppTheme

class MainActivity : ComponentActivity() {
    private val SongList = ArrayList<String>()
    private val ArtistList = ArrayList<String>()
    private val RatingList = ArrayList<String>()
    private val CommentsList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add Screen buttons
        val addButton = findViewById<Button>(R.id.addButton)
        val goToSecondButton = findViewById<Button>(R.id.goToSecondButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        // Navigation Logic
        addButton.setOnClickListener {
            val addLayout.visibility = View.GONE

            goToSecondButton.setOnClickListener {
                val addLayout.visibility = View.GONE

            }
            exitButton.setOnClickListener {
                finish()
            }

            // Add Items Dialog
            addButton.setOnClickListener {
                val dialogView = layoutInflater.inflate(R.layout.dialog_add_song, null)
                val EditSong = dialogView.findViewById<EditText>(R.id.edtSong)
                val EditArtistName = dialogView.findViewById<EditText>(R.id.edtArtist)
                val EditRating = dialogView.findViewById<EditText>(R.id.edtRating)
                val EditComments = dialogView.findViewById<EditText>(R.id.edtComments)

                private val AddToPlaylist() {
                val editSong = null
                val SongTitle = editSong.text.toString()
                val Artists = editArtist.text.toString()
                val Rating = editRating.text.toString()
                val Comments = editComments.text.toString()


            }
                if (song.isBlank() || artist.isBlank() || rating.isBlank() || comments.isBlank())
            }
        }else
        SongList.add(song)
        ArtistList.add(artist)
        RatingList.add(rating)
        CommentsList.add(comments)

        Log.i("Song Added", "$song added with rate $rating ")

            .setNegativeButton("Cancel", null)
        }

        // Show song details and average rating

    private fun showDetailsDialog() {
        if (song.isEmpty()) {
            Toast.makeText(this, "Playlist is empty", Toast.LENGTH_SHORT).show() return
        }

        val builder = StringBuilder()
        val totalRating = 0

        for (i in song.indices) {
            builder.append("Title: ${song[i]}\n")
            builder.append("Artist: ${artist[i]}\n")
            builder.append("Rating: ${rating[i]}\n")
            builder.append("Comments: ${comments[i]}\n")
            totalRating += rating[i]
        }

        val avg = totalRating.toDouble()/rating.size
        builder.append("Average Rating:%2f" formant(avg))

        AlertDialog.Builder(this)
            .setTitle("Playlist Details")
            .setMessage(builder.toString())
            .setPositiveButton("Ok", null)
            .create()
            .show()
    }
}





