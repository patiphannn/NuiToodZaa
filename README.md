
# react-native-nui-tood-zaa

## Getting started

`$ npm install react-native-nui-tood-zaa --save`

### Mostly automatic installation

`$ react-native link react-native-nui-tood-zaa`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-nui-tood-zaa` and add `RNNuiToodZaa.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNNuiToodZaa.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNNuiToodZaaPackage;` to the imports at the top of the file
  - Add `new RNNuiToodZaaPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-nui-tood-zaa'
  	project(':react-native-nui-tood-zaa').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-nui-tood-zaa/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-nui-tood-zaa')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNNuiToodZaa.sln` in `node_modules/react-native-nui-tood-zaa/windows/RNNuiToodZaa.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNNuiToodZaa;` to the usings at the top of the file
  - Add `new RNNuiToodZaaPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNNuiToodZaa from 'react-native-nui-tood-zaa';

// TODO: What to do with the module?
RNNuiToodZaa;
```
  # NuiToodZaa
