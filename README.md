
# Emergency Help App

This is Emergency Help Line Application


## Features this apps

- Splash-Screen
- GridViews
- ListViews
- Hotlines Number / Emergency Number
- Image Carousel
- Internet Checker
- TRex Game View
- Animated Gradient Text View

## Color Reference

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
| Black | #FF000000
| White | #FFFFFFFF
| Nav and StatusBar Colors : colors1 | #009688
| Red | #E91E63
| Transparent | #00FFFFFF
| Yellow | #FFEB3B
| Funny_colors1 | #009688 
| Funny_colors2 | #E91E63
| Funny_colors3 | #FFFFFFFF
| Funny_colors4 | #A020F0


## Installation Library
#### 1. Add Lottie File Library
```java
dependencies {
    implementation 'com.airbnb.android:lottie:3.4.0'
  }
```
Lottie File xml code :    
```xml
  <com.airbnb.lottie.LottieAnimationView
    android:id="@+id/animationView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:lottie_rawRes="@raw/animation"
    app:lottie_autoPlay="true"
    app:lottie_loop="true"/>
```

#### 2. Add Rounded Image Library
```java
  repositories {
    mavenCentral()
}

dependencies {
    implementation 'com.makeramen:roundedimageview:2.3.0'
}
```
Rounded Image xml code :    
```xml
<com.makeramen.roundedimageview.RoundedImageView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/imageView1"
        android:src="@drawable/photo1"
        android:scaleType="fitCenter"
        app:riv_corner_radius="30dip"
        app:riv_border_width="2dip"
        app:riv_border_color="#333333"
        app:riv_mutate_background="true"
        app:riv_tile_mode="repeat"
        app:riv_oval="true" />
```

#### 3. Add Animated Gradients TextView Library
```java
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
```java
dependencies {
	compile 'com.github.Mursaat:AnimatedGradientTextView:v0.0.6'
}
```
Animated Gradients TextView xml code :    
```xml
<com.mursaat.extendedtextview.AnimatedGradientTextView
	android:layout_width="match_parent"
    	android:layout_height="wrap_content"
	app:colors="@array/funny_colors"
	app:simultaneousColors="4"
	app:angle="45"
	app:speed="1000"
	app:maxFPS="30"
	app:customFont="BebasNeue.otf" 
	/>
```

#### 4. Add Neumorphism Library
```java
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
```java
dependencies {
    implementation 'com.github.fornewid:neumorphism:0.3.2'
}
```

#### 5. Add Image-Carousel Library
```java
dependencies {
    implementation 'me.relex:circleindicator:2.1.6'
    implementation 'org.imaginativeworld.whynotimagecarousel:whynotimagecarousel:2.1.0'
}
```
Image-Carousel xml code :    
```xml
<org.imaginativeworld.whynotimagecarousel.ImageCarousel
    android:id="@+id/carousel"
    android:layout_width="match_parent"
    android:layout_height="256dp"/>
```

#### 6. Add Trex Game View [ When Internet is Disconnected] Library
```java
dependencies {
    implementation 'com.github.LionZXY.T-Rex-Android:trex-library:1.0.0'
}
```
Trex Game View xml code :    
```xml
<com.lionzxy.trex_library.TRexGameView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/trex"
        />
```

#### 7. Add Use Online Image In Projects Library
```java
repositories {
  google()
  mavenCentral()
}

dependencies {
  implementation 'com.github.bumptech.glide:glide:4.16.0'
}
```
Use Online Image Java code :    
```java
Glide.with(myFragment)
    .load(url)
    .centerCrop()
    .placeholder(R.drawable.loading_spinner)
    .into(myImageView);
```

## Screenshots

![Splash Screen](https://github.com/user-attachments/assets/c9816307-d32e-4f64-99c4-ac055e46136f)
![Home](https://github.com/user-attachments/assets/bdac3093-7f08-4d80-87f0-aacdf03a2627)
![hotlines](https://github.com/user-attachments/assets/3e6a14fa-9a4f-49f3-88ed-f200d585f37e)
![cyberbulling](https://github.com/user-attachments/assets/f4dff2b7-f2ac-41c1-bc72-447d76feab95)
![division](https://github.com/user-attachments/assets/50c79c47-1d39-4440-99be-f9dbccf616b4)
![district](https://github.com/user-attachments/assets/8d759715-a4ad-4d34-8bb8-e9f900c99cf6)
![thana](https://github.com/user-attachments/assets/371758d6-da0a-497a-8478-633896f5e23e)
![no net](https://github.com/user-attachments/assets/1f73b8f2-332e-4828-8eb2-3818c58868b3)


## Demo

![vedio-ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/f27b7023-ea44-43de-8174-274784e162d3)


## 🛠 Skills
Java,XML,SQL,Firebase,Python,HTML,CSS,Javascript,Bootstrap,Wordpress,C++...


## Authors

- [Prothes Barai](https://prothes-asp.github.io/prothes/)

