//package com.rnappthree
//
//import android.content.Context
//import android.graphics.Bitmap
//import android.graphics.Matrix
//import android.graphics.pdf.PdfRenderer
//import android.os.ParcelFileDescriptor
//import java.io.File
//
//class MyPdfViewer(context: Context): com.ortiz.touchview.TouchImageView(context) {
//
//    private var file: File? = null
//    private var mFileDescriptor: ParcelFileDescriptor? = null
//    private var mPdfRenderer: PdfRenderer? = null
//    private var mCurrentPage: PdfRenderer.Page? = null
//    private val mPageIndex = 0
//
//    init {
//        setUpPdfView()
//    }
//
//    private fun setUpPdfView(){
//        addImageFling()
//        loadPdfFromAsset()
//    }
//
//    private fun loadPdfFromAsset(){
//        file = fileFromAsset("sample.pdf")
//        renderPDF()
//        showPdf(mPageIndex)
//    }
//
//    private fun fileFromAsset(name: String): File =
//        File("${context.cacheDir}/$name").apply { writeBytes(context.assets.open(name).readBytes()) }
//
//    private fun renderPDF() {
//        mFileDescriptor = ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY)
//        if (mFileDescriptor != null) {
//            mPdfRenderer = PdfRenderer(mFileDescriptor!!)
//        }
//    }
//
//    private fun addImageFling() {
//        setOnTouchListener(object : OnSwipeTouchListener(context) {
//
//            override fun onSwipeTop() {
//                super.onSwipeTop()
//                swipeRight()
//            }
//
//            override fun onSwipeBottom() {
//                super.onSwipeBottom()
//                swipeLeft()
//            }
//
//        })
//
//    }
//
//    private fun swipeRight() {
//        if (mCurrentPage!!.index <= mPdfRenderer!!.pageCount) {
//            showPdf((mCurrentPage!!.index) + 1)
//        }
//    }
//
//    private fun showPdf(index: Int) {
//        if ((mPdfRenderer?.pageCount ?: 0) <= index) {
//            return
//        }
//
//        if (null != mCurrentPage) {
//            mCurrentPage?.close()
//        }
//
//
//        mCurrentPage = mPdfRenderer?.openPage(index)
//
//        val bitmap = mCurrentPage?.width?.let {
//            mCurrentPage?.height?.let { it1 ->
//                Bitmap.createBitmap(
//                    it, it1,
//                    Bitmap.Config.ARGB_8888
//                )
//            }
//        }
//
//
//        bitmap?.let {
//            mCurrentPage?.render(
//                it,
//                null,
//                Matrix().apply { postRotate(0F) },
//                PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY
//            )
//        }
//
//        setImageBitmap(bitmap)
//
//    }
//
//    private fun swipeLeft() {
//        if (mCurrentPage!!.index > 0) {
//            showPdf((mCurrentPage!!.index) - 1)
//        }
//    }
//
//
//
//}