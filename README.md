# FancyDialog
<a href="https://github.com/DarkionAvey/AchievementUnlocked-library/blob/master/app/app-release.apk?raw=true">Download APK (for Android KitKat+)</a>


<h1>AchievementUnlocked</h1>
<p>Animated pop-ups inspired by XBOX. </p>


the original library is <a href="https://github.com/DarkionAvey/AchievementUnlocked-library">here</a>  

<img src="/preview.gif" width="300" align="right" alt="AchievementUnlocked app demo" hspace="20">


## Add Library
```
repositories {
        jcenter()
    }
       

compile 'com.geniusforapp.achievementunlocked:achievement:0.0.1'

```
## Code Sample
```                
 private void showAchievement() {
         AchievementUnlocked test = new AchievementUnlocked(MainActivity.this).setReadingDelay(5000).setDismissible(true);
         AchievementData achievementData = new AchievementData();
         achievementData.setTitle("Replace with your own action");
         achievementData.setState(AchievementIconView.AchievementIconViewStates.FADE_DRAWABLE);
         achievementData.setBackgroundColor(getResources().getColor(R.color.colorAccent));
         achievementData.setIcon(getResources().getDrawable(android.R.drawable.ic_dialog_alert));
         achievementData.setTextColor(getResources().getColor(android.R.color.white));
         test.show(achievementData);
     }
      
```

## Permission required starting from 23
```
public boolean checkDrawOverlayPermission() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return true;
        }
        if (!Settings.canDrawOverlays(this)) {
            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
            startActivityForResult(intent, REQUEST_CODE);
            return false;
        } else {
            return true;
        }
    }
 
 // add this to your activity
 
 @Override
     @TargetApi(Build.VERSION_CODES.M)
     protected void onActivityResult(int requestCode, int resultCode, Intent data) {
         if (requestCode == REQUEST_CODE) {
             if (Settings.canDrawOverlays(this)) {
                 showAchievement();
             }
         }
     }
 
```


## Tips
tips will help the developer to program more library

<p><h3><a href="https://www.paypal.me/AhmadNajar/5">Coffee</a></h3></p>
<p><h3><a href="https://www.paypal.me/AhmadNajar/10">Donut</a></h3></p>
<p><h3><a href="https://www.paypal.me/AhmadNajar/10">Lunch</a></h3></p>


### Pull requests are welcome!

Feel free to contribute to FancyDialog.

If you've fixed a bug or have a feature you've added, just create a pull request. If you've found a bug, want a new feature, or have other questions, file an issue. I will try to answer as soon as possible.

### Applications using AchievementUnlocked-library

Please send a pull request if you would like to be added here.

## License
Copyright 2017 Ahmad Najar

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
