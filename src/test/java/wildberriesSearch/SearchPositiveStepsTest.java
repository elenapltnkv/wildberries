package wildberriesSearch;

import org.junit.jupiter.api.Test;
import stepPages.*;

public class SearchPositiveStepsTest extends Base {

    SimpleTextSteps simpleStep = new SimpleTextSteps();
    LongTextSteps longStep = new LongTextSteps();
    UploadPhotoSteps upStep = new UploadPhotoSteps();
    ArticulSteps aStep =  new ArticulSteps();
    CleanSearchSteps cleanStep = new CleanSearchSteps();


    @Test
    public void searchSimpleTextNoAuthorizedUser() {

        simpleStep.openMainPage();
        simpleStep.inputValueInSearch("платье");
        simpleStep.shouldHaveText("платье");
    }

    @Test
    public void searchLongTextNoAuthorizedUser() {

        longStep.openMainPage();
        longStep.longTextSearch("платье беленькое праздничное короткое");
        longStep.shouldHaveLongText("платье беленькое праздничное короткое");
    }

    @Test
    public void searchUploadPhotoNoAuthorizedUser() {

        upStep.openMainPage();
        upStep.photoSearch();
        upStep.uploadPhotoInSearch();
        upStep.shouldHaveSearchResult();
    }
    @Test
    public void searchArticulNoAuthorizedUser() {

        aStep.openMainPage();
        aStep.articulSearch("17700488");
        aStep.shouldHaveArticul("17700488");

    }

    @Test
    public void cleanSimpleTextSearchLineNoAuthorizedUser() {

        cleanStep.openMainPage();
        cleanStep.cleanSearchInputText("платье");
        cleanStep.cleanSearchText();
        cleanStep.shouldHaveCleanSearch();
    }


}
