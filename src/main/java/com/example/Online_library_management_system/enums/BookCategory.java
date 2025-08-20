package com.example.Online_library_management_system.enums;

public enum BookCategory {

    FICTION("Fiction", "Fictional narratives and stories"),
    NON_FICTION("Non-Fiction", "Factual and informational content"),
    SCIENCE_FICTION("Science Fiction", "Speculative fiction with scientific themes"),
    MYSTERY("Mystery", "Mystery and detective stories"),
    BIOGRAPHY("Biography", "Life stories of real people"),
    TECHNOLOGY("Technology", "Technology, computing, and innovations"),
    MATHEMATICS("Mathematics", "Mathematical concepts and studies"),
    HISTORY("History", "Historical events and analysis"),
    ART("Art", "Visual arts, design, and creativity");

    private final String displayName;
    private final String description;

    BookCategory(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }
}
