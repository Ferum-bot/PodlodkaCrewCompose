package com.github.ferum_bot.podlodcrewcompose.ui.fragment.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.ferum_bot.podlodcrewcompose.core.models.SessionModel

class DetailScreenViewModel: ViewModel() {

    private val _session: MutableLiveData<SessionModel> = MutableLiveData()
    val session: LiveData<SessionModel> = _session

}