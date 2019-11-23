/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.browserAutomation.Find;
import org.xtext.example.mydsl.browserAutomation.Launch;
import org.xtext.example.mydsl.browserAutomation.Model;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class BrowserAutomationGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile("Test.java", 
      this.generateModel(IteratorExtensions.<Model>head(Iterators.<Model>filter(resource.getAllContents(), Model.class))));
  }
  
  public CharSequence generateModel(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.junit.jupiter.api.Test;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.openqa.selenium.By;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.openqa.selenium.WebDriver;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.openqa.selenium.WebElement;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.openqa.selenium.firefox.FirefoxDriver;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.openqa.selenium.support.ui.ExpectedConditions;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import org.openqa.selenium.support.ui.WebDriverWait;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import static org.junit.jupiter.api.Assertions.assertNotNull;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import static org.junit.jupiter.api.Assertions.assertTrue;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("@Test");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("public void test() {");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("System.setProperty(\"webdriver.gecko.driver\",\"C:/Users/cocop/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe\");");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("WebDriver driver = new FirefoxDriver();");
    _builder.newLine();
    _builder.append("\t ");
    CharSequence _generateLaunch = this.generateLaunch(m.getTisi1().get(0));
    _builder.append(_generateLaunch, "\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(\"//button[@class=\'agree-button eu-cookie-compliance-default-button\']\"))).click(); //ACCEPT COOKIE");
    _builder.newLine();
    _builder.append("\t  ");
    CharSequence _generateFind = this.generateFind(m.getTisi6().get(0));
    _builder.append(_generateFind, "\t  ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("driver.close();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateLaunch(final Launch l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("driver.get(\"");
    String _name = l.getU().getName();
    _builder.append(_name);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateFind(final Find f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((f != null)) {
        _builder.append("WebElement textDemo0 = driver.findElement(By.xpath(\"//*[contains(text(),");
        String _s = f.getS();
        _builder.append(_s);
        _builder.append(")]\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("assertNotNull(textDemo0);");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
