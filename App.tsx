/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import type {PropsWithChildren} from 'react';
import {
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  useColorScheme,
  useWindowDimensions,
  View,
} from 'react-native';

import {
  Colors,
  DebugInstructions,
  Header,
  LearnMoreLinks,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';
import RTNMyPdfViewer from 'rtn-my-pdf-viewer/js/RTNMyPdfViewerNativeComponent';

function App(): JSX.Element {
  const isDarkMode = useColorScheme() === 'dark';

  const backgroundStyle = {
    backgroundColor: isDarkMode ? Colors.darker : Colors.lighter,
  };

  const {width, height} = useWindowDimensions();

  return (
    <SafeAreaView style={backgroundStyle}>
      <StatusBar
        barStyle={isDarkMode ? 'light-content' : 'dark-content'}
        backgroundColor={backgroundStyle.backgroundColor}
      />
      <RTNMyPdfViewer style={{width, height}} />
    </SafeAreaView>
  );
}

//yarn add ./RTNMyPdfViewer

// node rnappthree/node_modules/react-native/scripts/generate-codegen-artifacts.js \
//   --path rnappthree/ \
//   --outputPath rnappthree/RTNMyPdfViewer/generated/

export default App;
