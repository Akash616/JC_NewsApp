package io.akash.app.presentation.onboarding

import androidx.annotation.DrawableRes
import io.akash.app.R

/*presentation package is a part of clean architecture layers.
In this we are going to create the UI related code like screens,
view models and anything related to the screen.*/

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

//list of the pages
val pages = listOf(
    Page(
        title = "Lorem Ipsum is simply dummy",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Lorem Ipsum is simply dummy",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Lorem Ipsum is simply dummy",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        image = R.drawable.onboarding3
    )
)
