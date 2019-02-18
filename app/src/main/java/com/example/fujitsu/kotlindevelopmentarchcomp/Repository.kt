package com.example.fujitsu.kotlindevelopmentarchcomp

import android.databinding.BaseObservable
import android.databinding.Bindable

class Repository(repositoryName : String?, var repositoryOwner: String?, var numberOfStars: Int?
                 , var hasIssues: Boolean = false) : BaseObservable()