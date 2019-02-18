package com.example.fujitsu.kotlindevelopmentarchcomp

class MainViewModel {

    var repoModel: RepoModel = RepoModel()
    var text: String = ""
    var isLoading: Boolean = false

    val onDataReadyCallback = object : OnDataReadyCallback {
        override fun onDataReady(data: String) {
            isLoading = false
            text = data
        }
    }

    fun refresh() {
        repoModel.refreshData( object : OnDataReadyCallback {
            override fun onDataReady(data: String) {
                text = data
            }
        })

    }
}