package com.example.timurmuhortov.dubnabus.di.module

import com.example.timurmuhortov.dubnabus.data.repository.ScheduleNetworkRepository
import com.example.timurmuhortov.dubnabus.domain.irepository.IScheduleNetworkRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * @author: timur.mukhortov
 * date: 14.02.2018
 * time: 21:26
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/

@Module
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun provideNetworkScheduleRepository(repository: ScheduleNetworkRepository): IScheduleNetworkRepository
}