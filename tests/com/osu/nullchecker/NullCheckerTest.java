package com.osu.nullchecker;

import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import com.intellij.openapi.actionSystem.IdeActions;

/**
 * Created by lily on 7/10/15.
 */
public class NullCheckerTest extends LightCodeInsightFixtureTestCase {

    @Override
    protected String getTestDataPath() {
        return "../NullCheckPlugin/testData";
    }

    public void testAddBrackets() {
        myFixture.configureByFile("BeforeApplyingChanges.java");
//        myFixture.testAction()
//        myFixture.performEditorAction();
        myFixture.type('{');
        myFixture.performEditorAction(IdeActions.ACTION_EDITOR_ENTER);
//        myFixture.performEditorAction("EditorEnter");
        myFixture.checkResultByFile("AfterAddingBrackets.java", false);
    }

    
}
