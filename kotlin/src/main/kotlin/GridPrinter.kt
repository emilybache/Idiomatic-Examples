import kotlin.math.max


class GridPrinter {
    companion object {
        fun print(grid: Grid, includeLabels: Boolean = true): String {
            val field_width = max("${grid.width()}".length, "${grid.height()}".length)
            val all_content = ArrayList<List<String>>()

            if (includeLabels) {
                val header_row = ArrayList<String>()
                header_row.add("".padStart(field_width))
                for (i: Int in 0 until grid.width()) {
                    header_row.add("$i".padStart(field_width))
                }
                all_content.add(header_row)
            }

            for (j: Int in 0 until grid.height()) {
                val row_contents = ArrayList<String>()
                if (includeLabels) {
                    val y_coords = "$j".padStart(field_width)
                    row_contents.add(y_coords)
                }
                for (i: Int in 0 until grid.width()) {
                    row_contents.add(grid.contentAt(i, j).padStart(field_width))
                }
                all_content.add(row_contents)
            }
            return all_content.map { it.joinToString(" ") }.joinToString("\n")
        }
    }
}
