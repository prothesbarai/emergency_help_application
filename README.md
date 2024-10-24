
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
```bash
dependencies {
    implementation 'com.airbnb.android:lottie:3.4.0'
  }
```
Lottie File xml code :    
```bash
  <com.airbnb.lottie.LottieAnimationView
    android:id="@+id/animationView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:lottie_rawRes="@raw/animation"
    app:lottie_autoPlay="true"
    app:lottie_loop="true"/>
```

#### 2. Add Rounded Image Library
```bash
  repositories {
    mavenCentral()
}

dependencies {
    implementation 'com.makeramen:roundedimageview:2.3.0'
}
```
Rounded Image xml code :    
```bash
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
```bash
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
```bash
dependencies {
	compile 'com.github.Mursaat:AnimatedGradientTextView:v0.0.6'
}
```
Animated Gradients TextView xml code :    
```bash
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
```bash
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
```bash
dependencies {
    implementation 'com.github.fornewid:neumorphism:0.3.2'
}
```

#### 5. Add Image-Carousel Library
```bash
dependencies {
    implementation 'me.relex:circleindicator:2.1.6'
    implementation 'org.imaginativeworld.whynotimagecarousel:whynotimagecarousel:2.1.0'
}
```
Image-Carousel xml code :    
```bash
<org.imaginativeworld.whynotimagecarousel.ImageCarousel
    android:id="@+id/carousel"
    android:layout_width="match_parent"
    android:layout_height="256dp"/>
```

#### 6. Add Trex Game View [ When Internet is Disconnected] Library
```bash
dependencies {
    implementation 'com.github.LionZXY.T-Rex-Android:trex-library:1.0.0'
}
```
Trex Game View xml code :    
```bash
<com.lionzxy.trex_library.TRexGameView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/trex"
        />
```

#### 7. Add Use Online Image In Projects Library
```bash
repositories {
  google()
  mavenCentral()
}

dependencies {
  implementation 'com.github.bumptech.glide:glide:4.16.0'
}
```
Use Online Image Java code :    
```bash
Glide.with(myFragment)
    .load(url)
    .centerCrop()
    .placeholder(R.drawable.loading_spinner)
    .into(myImageView);
```

## Screenshots

![Splash Screen](https://github.com/user-attachments/assets/37299170-c2ee-45ef-98ae-eef6120473b3)
![Home](https://github.com/user-attachments/assets/8efc2463-0151-46c9-8e90-411d917b7ce2)
![hotlines](https://github.com/user-attachments/assets/d1d45aae-7562-416b-8966-8fbeb1d48b41)
![cyberbulling](https://github.com/user-attachments/assets/c2f23284-5f5a-433d-822f-18a731ee26e5)
![division](https://github.com/user-attachments/assets/4efc29ee-7e32-413b-ae18-d05ab2f3dd14)
![district](https://github.com/user-attachments/assets/fa398686-8f15-42a9-a879-4ef47c697faf)
![thana](https://github.com/user-attachments/assets/54e1fdb8-4c38-4a64-92d2-91b0ae7b983d)
![no net](https://github.com/user-attachments/assets/0412d1ae-cacf-42da-9b6d-f48dcb35232b)


## Demo

https://github.com/user-attachments/assets/974a4174-339a-4f1b-89ce-fa25fcb45619

![vedio-ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/382fc485-5596-4e90-8173-29cef8bfae50)


## 🛠 Skills
Java,XML,SQL,Firebase,Python,HTML,CSS,Javascript,Bootstrap,Wordpress,C++...


## Authors

- [Prothes Barai](https://prothes-asp.github.io/prothes/)

