# Animation Plus in Android

A lightweight Android library that provides extra native animations like margin, padding, height and weight animations.

**what's new in 1.1.0**

Support AndroidX and kotlin tutorials.

**Installing**
 
 Add it in your root build.gradle at the end of repositories:
 
 ```groovy
 	allprojects {
 		repositories {
 			...
 			maven { url 'https://jitpack.io' }
 		}
 	}
  ```
 	
 Step 2. Add the dependency
 
 ```groovy
 	dependencies {
 		compile 'com.github.mmoamenn:AnimationsPlus:1.1.0'
 	}
 ```

**How to use in your application**

Height animation

![Height animation](https://github.com/mmoamenn/AnimationsPlus/blob/master/samples/height.gif)

```kotlin
val heightAnimation = HeightAnimation(view, currentHight, targetHeight)
heightAnimation.duration = TIME
view.startAnimation(heightAnimation)
```

Width animtion

![Height animation](https://github.com/mmoamenn/AnimationsPlus/blob/master/samples/width.gif)

```kotlin
val heightAnimation = WidthAnimation(view, currentWidth, targetWidth)
widthAnimation.setDuration(TIME)
view.startAnimation(heightAnimation)
```

Animation direction Options

```kotlin
enum class AnimationDirection {
    START, END, TOP, BOTTOM, ALL
}
```

Padding Animation

![Height animation](https://github.com/mmoamenn/AnimationsPlus/blob/master/samples/padding.gif)

```kotlin
val heightAnimation = HeightAnimation(view, currentHight, targetHeight)
heightAnimation.duration = TIME
view.startAnimation(heightAnimation)
```

Margin Animation

![Height animation](https://github.com/mmoamenn/AnimationsPlus/blob/master/samples/margin.gif)

```kotlin
val marginAnimation = MarginAnimation(view, AnimationDirection.START, 100)
marginAnimation.duration = TIME
view.startAnimation(marginAnimation)
```

**You can add above animations to any animation set and deal with them like any native animation**

```kotlin
val animationSet = AnimationSet(true).apply {
    addAnimation(marginAnimation)
    addAnimation(paddingAnimation)
    addAnimation(sacleAnimation)
    addAnimation(transetionAnimation)
}
animationSet.start()
```


