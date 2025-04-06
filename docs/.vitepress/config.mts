import { defineConfig } from 'vitepress';

export default defineConfig({
  lang: 'en-US',
  title: 'Java Projects',
  description: 'Collection of Java Programming Projects',

  themeConfig: {
    logo: '/logo.svg',
    nav: [
      { text: 'Home', link: '/' },
      { text: 'Projects', link: '/projects' },
      { text: 'Getting Started', link: '/getting-started' },
      {
        text: 'Resources',
        items: [
          { text: 'Java Documentation', link: 'https://docs.oracle.com/en/java/' },
          { text: 'Contributing', link: '/contributing' },
          { text: 'FAQ', link: '/faq' }
        ]
      }
    ],

    sidebar: [
      {
        text: 'Guide',
        items: [
          { text: 'Getting Started', link: '/getting-started' },
          { text: 'Projects', link: '/projects' },
          { text: 'FAQ', link: '/faq' },
          { text: 'Contributing', link: '/contributing' }
        ],
      },
      {
        text: 'Projects',
        items: [
          { text: 'Calculator', link: '/projects/calculator' },
          { text: 'Number Guessing Game', link: '/projects/number-guessing-game' },
        ],
      },
      {
        text: 'Advanced Topics',
        items: [
          { text: 'Best Practices', link: '/advanced/best-practices' },
          { text: 'Design Patterns', link: '/advanced/design-patterns' },
          { text: 'Testing', link: '/advanced/testing' }
        ]
      }
    ],

    socialLinks: [
      { icon: 'github', link: 'https://github.com/Sumangal44/javaprojects' }
    ],

    footer: {
      message: 'Built with Java ☕',
      copyright: 'Copyright © 2025 Java Projects. All rights reserved.'
    },

    search: {
      provider: 'local'
    },

    outline: {
      level: [2, 3],
      label: 'On this page'
    }
  },

  head: [
    ['link', { rel: 'icon', type: 'image/svg+xml', href: '/logo.svg' }]
  ]
});