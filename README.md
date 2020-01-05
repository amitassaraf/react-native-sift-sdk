# react-native-sift-sdk

## Getting started

`$ yarn add react-native-sift-sdk`

### Mostly automatic installation

`$ yarn react-native link react-native-sift-sdk`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-sift-sdk` and add `RNSiftSdk.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNSiftSdk.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.RNSiftSdkPackage;` to the imports at the top of the file
  - Add `new RNSiftSdkPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-sift-sdk'
  	project(':react-native-sift-sdk').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-sift-sdk/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-sift-sdk')
  	```

## Usage
```javascript
import Sift from 'react-native-sift-sdk';

Sift.initSdk(accountid, beaconkey); //init sdk

Sift.setUserId(id); // set user id

Sift.unsetUserId(); // unset user id on logout
```
