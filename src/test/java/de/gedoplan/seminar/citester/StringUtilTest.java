package de.gedoplan.seminar.citester;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest
{
  @Test
  public void testASCII()
  {
    assertThat(StringUtil.countLower("Hello, world!"), is(9));
  }

  @Test
  public void testUmlaut()
  {
    assertThat(StringUtil.countLower("Schön, dass du da bist!"), is(16));
  }

}
