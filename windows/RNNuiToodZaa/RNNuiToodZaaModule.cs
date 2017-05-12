using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNNuiToodZaa
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNNuiToodZaaModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNNuiToodZaaModule"/>.
        /// </summary>
        internal RNNuiToodZaaModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNNuiToodZaa";
            }
        }
    }
}
