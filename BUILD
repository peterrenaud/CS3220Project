java_binary(
	name = "management_tool",
	srcs = ["managementTool.java"],
	main_class = "managementTool",
	deps=[":politics","emergency_services"],

)



java_library(
	name = "politics",
	srcs = ["Politics.java"],
	deps=[":csv_parser"],
)

java_library(
	name = "election_results",
	srcs = ["ElectionResults.java"],
	deps=[":csv_parser"],
)
java_library(
	name = "emergency_services",
	srcs = ["EmergencyServices.java"],
	deps=[":csv_parser"],
)
java_library(
	name = "output_table",
	srcs = ["OutputTable.java"],
)
java_library(
	name = "csv_parser",
	srcs = ["CSVParser.java"],
	deps=[":output_table"],
)