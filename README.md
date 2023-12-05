# UnitEval NG 

Simulation AI-Copilot Experience for UnitEval.

## AI Assistant Programming

### AutoDev: Static Analysis

Elements:

- BeforeCursor
- ImportedFile
- RelatedSnippet
- RetrievalSnippet

### GitHub Copilot: Similar Chunk

Completion type:

- Inline completion
- In-block completion
- After-block completion

Elements:

- BeforeCursor
- AfterCursor
- SimilarFile
- ImportedFile
- LanguageMarker
- PathMarker
- RetrievalSnippet

### JetBrains AI Assistant: Static Analysis

Elements:

- `$SELECTION`: a Markdown-formatted code block with current code selection and language name.
- `$SELECTION_RAW`: selected code fragment.
- `$SELECTION_LANG`: the language of the currently selected code fragment.
- `$PRODUCT_NAME`: the name of the product that is currently launched, for example, IntelliJ IDEA.

[https://www.jetbrains.com/help/idea/ai-assistant.html#ai_add_custom_prompts](https://www.jetbrains.com/help/idea/ai-assistant.html#ai_add_custom_prompts)

