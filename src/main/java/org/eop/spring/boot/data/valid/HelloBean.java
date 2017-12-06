package org.eop.spring.boot.data.valid;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
public class HelloBean {
	
	@AssertTrue
	@AssertFalse
	public Boolean bool;

	@Range(min = 18, max = 100)
	@Digits(integer = 4, fraction = 2)
	@DecimalMax("1.0")
	@DecimalMin("0.9")
	@Min(18)
	@Max(100)
	public Integer age;
	
	@NotBlank
	@NotEmpty
	@Length(min = 2, max = 10)
	@Size(min = 2, max = 10)
	@Null
	@NotNull
	public String name;
	
	@Past
	@Future
	public Date birth;
	
	@Email(regexp = "", flags = {Pattern.Flag.CASE_INSENSITIVE})
	@Pattern(regexp = "", flags = {Pattern.Flag.CASE_INSENSITIVE})
	public String email;
	
	//级联对WorldBean也进行验证
	@Valid
	public WorldBean world;
}
