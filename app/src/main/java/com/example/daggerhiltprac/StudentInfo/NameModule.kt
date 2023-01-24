package com.example.daggerhiltprac.StudentInfo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class NameModule {

    @Binds
    @Singleton
    abstract fun binding(
        student: Student
    ): StudentName
}