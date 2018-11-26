# CurvedBottomNavigation
This a material design implementation of the bottomnavigation but with fab anchored on the view just like the BottomAppBar that was introduced recently by Google's Material Design Team.


Usage

<androidx.coordinatorlayout.widget.CoordinatorLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

    <androidx.core.widget.NestedScrollView android:layout_width="match_parent"
                                           android:id="@+id/nested"
                                           android:layout_height="match_parent">
        <TextView
                android:layout_width="match_parent"
                android:text="@string/cat_curvedbottombar_lorem_ipsum"
                android:layout_height="wrap_content"/>
    </androidx.core.widget.NestedScrollView>

    <com.scaleup.admin.library.curvedbottomnavigation.CurvedBottomBar android:layout_width="match_parent"
                                                                      android:id="@+id/bar"
                                                                      app:curvedHideOnScroll="true"
                                                                      app:curvedBackgroundTint="@android:color/white"
                                                                      android:layout_gravity="bottom"
                                                                      app:menu="@menu/navigation"
                                                                      app:labelVisibilityMode="labeled"
                                                                      app:curvedFabCradleMargin="8dp"
                                                                      android:layout_height="wrap_content"/>

    <com.google.android.material.floatingactionbutton.FloatingActionButton android:layout_width="wrap_content"
                                                                           app:layout_anchor="@id/bar"
                                                                           android:id="@+id/fab"
                                                                           android:layout_height="wrap_content"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>

I recommend using  app:curvedBackgroundTint="@android:color/white" because theming is buggy and also use Material design theme the lib requires it.
