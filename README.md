# Android Endless Grid Design App with Paging3

This app is a sample project that achieves an Endless Grid Design using Jetpack Compose and Paging3. 

This is the demo app that was presented during the "potatotips #83 iOS/Android Development Tips Sharing Event" Lightning Talk.

The details of the LT have been published on [Speaker Deck](https://speakerdeck.com/akkie76/jetpack-composetopaging3deshi-xian-suru-endless-grid-design).

## Screenshots

<img src="screenshots/screenshot.gif" width="170"/>

## Requirements

### Unsplash API key

App uses the [Unsplash API](https://unsplash.com/developers) to load pictures on the gallery
screen. To use the API, you will need to obtain a free developer API key. See the
[Unsplash API Documentation](https://unsplash.com/documentation) for instructions.

Once you have the key, add this line to the `gradle.properties` file, either in your user home
directory (usually `~/.gradle/gradle.properties` on Linux and Mac) or in the project's root folder:

```
unsplash_access_key=<your Unsplash access key>
```

The app is still usable without an API key.
