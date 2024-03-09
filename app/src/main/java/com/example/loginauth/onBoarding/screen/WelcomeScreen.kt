import android.graphics.pdf.PdfDocument.Page
import android.support.annotation.DrawableRes
import com.example.loginauth.R

data class WelcomeScreen(
    @DrawableRes val image: Int
)

val pages = listOf(
    WelcomeScreen(
        image = R.drawable.pertama
    ),
    WelcomeScreen(
        image = R.drawable.kedua
    ),
    WelcomeScreen(
        image = R.drawable.ketiga
    )
)