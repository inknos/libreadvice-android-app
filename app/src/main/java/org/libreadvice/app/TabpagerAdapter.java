package org.libreadvice.app;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabpagerAdapter extends FragmentStatePagerAdapter {
    String[] tabarray = new String[] {"Trending", "Latest", "Bookmarks"};
    Integer tabnumber = 3;
    public TabpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                Trending trending = new Trending();
                return trending;
            case 1:
                Latest latest = new Latest();
                return latest;
            case 2:
                Bookmark bookmark = new Bookmark();
                return bookmark;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
