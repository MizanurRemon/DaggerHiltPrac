package com.example.daggerhiltprac.StudentInfo

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

//provides less boilerplate code
//@Module
//@InstallIn(SingletonComponent::class)
//abstract class NameModule {
//
//    @Binds
//    @Singleton
//    abstract fun binding(
//        student: Student
//    ): StudentName
//}


//provide much boilerplate code
@Module
@InstallIn(SingletonComponent::class)
class NameModule {


    @Provides
    @Singleton
    fun getFName(): String = "Ali"

    @Provides
    @Singleton
    fun binding(
        name: String
    ):StudentName = Student(name)


    @Provides
    @FName
    fun getfirstname(): String = "Mizanur"

    @Provides
    @LName
    fun getlastname(): String = "Remon"

}


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName