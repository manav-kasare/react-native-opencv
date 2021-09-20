import React, {useEffect} from 'react';
import {View, Text} from 'react-native';
import {OpenCV} from './nativeModules';

export default function App() {
  useEffect(() => {
    handleLoad();
  }, []);

  const handleLoad = async () => {
    const response = await OpenCV.load();
    console.log('Load response', response);
  };

  return (
    <View>
      <Text>Hello There</Text>
    </View>
  );
}
