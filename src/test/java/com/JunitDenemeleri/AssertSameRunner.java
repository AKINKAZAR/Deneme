package com.JunitDenemeleri;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(AssertSameSelectable.class)
@Suite.SuiteClasses({AppTest.class})

public class AssertSameRunner {
}
