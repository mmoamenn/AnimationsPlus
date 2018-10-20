# Animation Plus in Android

A lightweight android library that provides extra native animations like margin, padding, height and weight animations 

**How to use in your application**

Height animation

```java
 HeightAnimation heightAnimation = new HeightAnimation(view , currentHight , targetHeight);
 heightAnimation.setDuration(TIME);
 view.startAnimation(heightAnimation);
```

Width animtion

```java
 WidthAnimation heightAnimation = new WidthAnimation(view , currentWidth , targetWidth);
 widthAnimation.setDuration(TIME);
 view.startAnimation(heightAnimation);
```

Animation direction Options

```java
 public enum AnimationDirection {
    START , END , TOP , BOTTOM , ALL
}
```

Padding Animation

```java
PaddingAnimation paddingAnimation = new PaddingAnimation(view, AnimationDirection.ALL, currentPadding, targetPadding);
paddingAnimation.setDuration(TIME);
view.startAnimation(paddingAnimation);
```

Margin Animation

```java
MarginAnimation marginAnimation = new MarginAnimation(view, AnimationDirection.ALL, 100);
marginAnimation.setDuration(TIME);
view.startAnimation(marginAnimation);
```

**You can add above animations to any animation set and deal with them like any native animation**

```java
AnimationSet animationSet = new AnimationSet(true);
animationSet.addAnimation(marginAnimation);
animationSet.addAnimation(paddingAnimation);
animationSet.addAnimation(sacleAnimation);
animationSet.addAnimation(transetionAnimation);
animationSet.satrt();
```


