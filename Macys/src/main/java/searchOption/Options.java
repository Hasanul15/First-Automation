package searchOption;

import base.CommonAPI;

public class Options extends CommonAPI{
    public void searchMacys(){
        typeOnElementEntry("#globalSearchInputField","Calvin Klein");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField","Polo");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField","Wallet");
        navigateBack();
    }
}
