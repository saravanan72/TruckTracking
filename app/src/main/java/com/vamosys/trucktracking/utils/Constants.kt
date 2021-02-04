package com.vamosys.trucktracking.utils

import com.vamosys.trucktracking.model.LoadingPoints

public class Constants {
    companion object {
        val list: List<LoadingPoints> = listOf(
        LoadingPoints("Loading Point 1", "Bangalore Port", "05-02-2021 08.15 AM"),
        LoadingPoints("Loading Point 2", "Chennai Port", "08-02-2021 10.30 AM")
        //LoadingPoints("Loading Point 3", "Cochi Port", "11-02-2021 16.45 PM"),
        //LoadingPoints("Loading Point 4", "Vizhakapatnam Port", "15-02-2021 18.25 PM")
        )
    }

}