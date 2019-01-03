package search;

import base.CommonAPI;

public class SearchTab extends CommonAPI {
    public void searchMenu(){
        typeOnElementEntry("#gh-ac","TV");
        navigateBack();
        typeOnElementEntry("#gh-ac","iphone");
        navigateBack();
        typeOnElementEntry("#gh-ac","dress");
        navigateBack();

    }
}
