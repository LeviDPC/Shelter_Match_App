package lsj.softwareeng.sheltermatch.ui.fav;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FavViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FavViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}