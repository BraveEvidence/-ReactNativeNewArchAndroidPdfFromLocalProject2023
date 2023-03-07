//package com.rnappthree
//
//import com.facebook.react.bridge.ReactApplicationContext
//import com.facebook.react.uimanager.SimpleViewManager
//import com.facebook.react.uimanager.ThemedReactContext
//import com.facebook.react.uimanager.ViewManagerDelegate
//import com.facebook.react.viewmanagers.RTNMyPdfViewerManagerDelegate
//import com.facebook.react.viewmanagers.RTNMyPdfViewerManagerInterface
//
//class MyPdfViewerManager(private val context: ReactApplicationContext) :
//    SimpleViewManager<MyPdfViewer>(),
//    RTNMyPdfViewerManagerInterface<MyPdfViewer> {
//
//    private val mDelegate: ViewManagerDelegate<MyPdfViewer>
//
//    init {
//        mDelegate = RTNMyPdfViewerManagerDelegate(this)
//    }
//
//    override fun getDelegate(): ViewManagerDelegate<MyPdfViewer> {
//        return mDelegate
//    }
//
//    override fun getName(): String {
//        return NAME
//    }
//
//    companion object {
//        const val NAME = "RTNMyPdfViewer"
//    }
//
//    override fun createViewInstance(p0: ThemedReactContext): MyPdfViewer {
//        return MyPdfViewer(context)
//    }
//
//}