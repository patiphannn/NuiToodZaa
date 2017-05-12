
import { NativeModules } from 'react-native';
const { RNNuiToodZaa } = NativeModules;

// export default RNNuiToodZaa;
export default {
  show: (text, cb) => RNNuiToodZaa.show(text, (result) => {
    cb(result);
  })
}
