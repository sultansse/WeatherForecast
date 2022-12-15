package com.software1t.weatherforecast.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas non leo non odio egestas pellentesque. Praesent a risus vel odio tincidunt rhoncus. Etiam non augue eros. Nam sit amet cursus lorem. Nulla iaculis, neque non blandit porta, mauris libero aliquam metus, sit amet scelerisque velit odio eget sem. Donec arcu libero, egestas sit amet pellentesque eu, pretium ut lorem. Mauris semper non risus non accumsan. Quisque eget leo sit amet mauris pretium bibendum. Nulla pharetra tempus nibh quis sagittis. Sed nibh metus, volutpat at dignissim ut, condimentum vitae mi. Nulla aliquet non ligula vel dapibus. Etiam a sagittis elit. Vivamus eleifend interdum arcu nec ultrices. Aenean laoreet ornare nibh, eget condimentum arcu vehicula aliquam. Sed maximus viverra eros, a feugiat nunc porta at.\n" +
                "\n" +
                "Vivamus euismod tortor at eros gravida viverra. Aliquam sagittis quis purus ut eleifend. Nullam dignissim, dolor sit amet vehicula ultrices, felis tellus gravida tellus, nec gravida odio odio ut nisi. Vivamus et magna magna. Morbi euismod porta erat id porta. Ut sem justo, vehicula et malesuada id, venenatis eget dolor. Nunc mattis, neque at dictum sagittis, massa tortor iaculis ligula, id pulvinar mi nisl vitae sapien. Suspendisse vel elementum turpis. Curabitur vel feugiat magna. Nulla vel condimentum urna, vitae sodales orci. Maecenas varius venenatis justo non commodo. Duis ullamcorper odio ac quam sodales, sed tincidunt odio euismod.\n" +
                "\n" +
                "Etiam sem augue, dapibus feugiat odio non, porta eleifend ex. Mauris non imperdiet diam. Donec nec nunc est. Nullam vitae justo arcu. Maecenas vulputate tortor sit amet justo pretium imperdiet. Curabitur mollis varius risus vel suscipit. Fusce pulvinar lectus mi, quis interdum ante imperdiet ac. Duis fringilla sed justo vel imperdiet. Cras non lorem posuere, posuere metus eu, tincidunt velit. In eros sem, fringilla suscipit maximus luctus, cursus et ligula. Nullam posuere consequat justo, et ultricies sem cursus ut. Maecenas libero tortor, iaculis a ultricies et, facilisis ac sapien. Aenean suscipit purus eget risus viverra, ut tristique mi pellentesque. In velit justo, ornare sit amet nibh ac, tincidunt consequat odio. Aliquam dui quam, dignissim quis tortor a, dignissim gravida nibh.\n" +
                "\n" +
                "Morbi finibus dolor sit amet dolor aliquet elementum ut non libero. Duis semper nisl vitae ex faucibus fermentum. Sed vitae vestibulum sapien, et viverra orci. Nunc ultricies metus ac arcu rhoncus efficitur. Vivamus cursus libero in lacus porta, ut dignissim orci efficitur. Cras a libero eu nulla commodo lacinia convallis quis turpis. Integer efficitur, quam sit amet pellentesque fermentum, ex ipsum placerat diam, at sollicitudin lectus dolor ut augue. Nullam consequat diam vitae metus dictum scelerisque. Sed non tristique arcu.\n" +
                "\n" +
                "Duis lorem nulla, feugiat ac augue ac, vestibulum eleifend nulla. Pellentesque neque nunc, rhoncus nec metus ac, fermentum consectetur justo. Duis vitae orci hendrerit, aliquam est tincidunt, dignissim sem. Ut tempor, nisi non varius fermentum, purus justo iaculis ligula, vitae auctor tortor velit at metus. Nulla lobortis leo sem, id auctor risus auctor quis. Suspendisse mauris est, cursus in dolor condimentum, consectetur dictum ante. Donec cursus convallis posuere."
    }
    val text: LiveData<String> = _text
}