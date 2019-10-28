package com.astra.ses.spell.code_coverage.ui.commands;

public enum CodeCoverageAnnotation {
	ErrorFound("com.astra.ses.spell.code_coverage.error_found"),
	Executed("com.astra.ses.spell.code_coverage.executed"),
	PartialExecuted("com.astra.ses.spell.code_coverage.partial_executed"),
	NotExecuted("com.astra.ses.spell.code_coverage.not_executed");
	
	private String type;

	private CodeCoverageAnnotation(String type) {
		this.type = type;
	}
	
	
	public String getAnnotionType(){
		return type;
	}
}
